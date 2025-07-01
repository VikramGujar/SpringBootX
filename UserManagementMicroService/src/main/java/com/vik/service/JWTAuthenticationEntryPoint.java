package com.vik.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class JWTAuthenticationEntryPoint extends OncePerRequestFilter {

	
	@Autowired
	private JWTService ser;
	
	@Autowired
    private UserDetailsService detailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String authHeader = request.getHeader("Autherization");
		
		if(authHeader == null || !authHeader.startsWith("Bearer "))
		{
			filterChain.doFilter(request, response);
			return ;
		}
		
	
			
			final String jwtToken = authHeader.substring(7);
			final String userEmail = ser.extractUsername(jwtToken);
			
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
			if(userEmail != null && authentication == null )
			{
				UserDetails user = detailsService.loadUserByUsername(userEmail);
				
				if(ser.isTokenValid(jwtToken, user))
				{
					UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(user,null, user.getAuthorities());
					authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					SecurityContextHolder.getContext().setAuthentication(authToken);
				}
			}
		
		filterChain.doFilter(request, response);
		
		
		
	}

}
