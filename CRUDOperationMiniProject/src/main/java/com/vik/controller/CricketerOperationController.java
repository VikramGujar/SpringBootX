package com.vik.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vik.entity.Players;
import com.vik.service.CricketerOperationService;

@Controller
public class CricketerOperationController {

	@Autowired
	CricketerOperationService ser;
	
	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping("show")
	public String showPlayers(Map<String, Object> map)
	{
		List<Players> allPlayers = ser.allPlayers();
		map.put("players", allPlayers);
		return "show_all_players";
	}
	
	
	@GetMapping("register")
	public String addPlayer(@ModelAttribute("plyr") Players pl) {
		return "show_register_form";
	}
	
	@PostMapping("register")
	public String regsterPlayer(@ModelAttribute("plry") Players pl, RedirectAttributes rda)
	{
		String msg = ser.addPlayer(pl);
		rda.addFlashAttribute("addResult",msg);
		return "redirect:/show";
	}
	
	@GetMapping("edit")
	public String editeForm(@ModelAttribute("plyr") Players pl, @RequestParam("no") int id) {
		return "show_edit_form";
	}
	
	@PostMapping("edit")
	public String editeData(@ModelAttribute("plyr") Players pl, @RequestParam("no") int id, RedirectAttributes rd) {
		Players plr = ser.getPlayerById(id);
		ser.addPlayer(plr);
		rd.addFlashAttribute("Result",id+" ID Record is update");
		return "redirect:/show";
	}
}
