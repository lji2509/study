package board.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import board.a02_service.BoardService;
import board.a04_vo.Board;

@Controller
@RequestMapping("/board.do")
public class BoardController {
	@Autowired
	private BoardService service;
	
	// http://localhost:8000/board/board.do?method=list
	@RequestMapping(params="method=list")
	public String boardList(Board sch, Model d) {
		d.addAttribute("boardList", service.getBoardList(sch));
		return "a01_boardList";
	}
}
