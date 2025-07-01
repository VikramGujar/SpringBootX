package com.vik.service;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.vik.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {

    private static final String secretKey = "XqS3aJzZqybzV0koykJ7zF4EbXtZPiX9UmNvYHEzH1o="; // valid base64 string
    private static final long jwtExpireTime = 3600000; // 1 hour in ms

    public String extractUsername(String token) {
        return extractClaims(token, Claims::getSubject);
    }
    
    

    public static <T> T extractClaims(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}



	public static Claims extractAllClaims(String token) {
        return  Jwts
        		.parser()
        		.setSigningKey(getSignKey())
        		.build()
        		.parseClaimsJws(token)
        		.getBody();
    }

    public String generateToken(Map<String, Object> extraClaims, User userDetails) {
        return buildToken(extraClaims, userDetails);
    }

    public String buildToken(Map<String, Object> extraClaims, User userDetails) {
        return Jwts.builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpireTime))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean isTokenValid(String token, UserDetails user)
    {
    	final String userName = extractUsername(token);
    	return userName.equals(user.getUsername()) && !isTokenExpired(token);
    }
    
    public boolean isTokenExpired(String token) {
		
		return extractExpiration(token).before(new Date());
	}
    
    public Date extractExpiration(String token)
    {
    	return extractClaims(token, Claims::getExpiration);
    }

	public static Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
