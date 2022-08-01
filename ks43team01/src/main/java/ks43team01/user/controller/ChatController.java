package ks43team01.user.controller;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.lang.reflect.Member;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team01.dto.Chat;
import ks43team01.dto.File;
import ks43team01.dto.User;
import ks43team01.service.ChatService;
import ks43team01.service.UserService;

@Controller
@RequestMapping("/userpage/chat")
public class ChatController {

	
	
	private static final Logger log = LoggerFactory.getLogger(ChatController.class);

	public final ChatService chatService;
	
	public ChatController(ChatService chatService) {
		this.chatService = chatService;
	}
	
	/*파일 다운로드 */
	@GetMapping("/download")
	public void download(HttpServletResponse response, @RequestParam MultipartFile[] chatImgFile, File file) {

		String fileName = file.getFileReName();
		String saveFileName = file.getFileOriginalName();
		int fileLength = file.getFileSize();

		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\";");
		response.setHeader("Content-Transfer-Encoding", "binary");
		response.setHeader("Content-Length", "" + fileLength);
		response.setHeader("Pragma", "no-cache;");
		response.setHeader("Expires", "-1;");

		try (FileInputStream fis = new FileInputStream(saveFileName); OutputStream out = response.getOutputStream();) {
			int readCount = 0;
			byte[] buffer = new byte[1024];
			while ((readCount = fis.read(buffer)) != -1) {
				out.write(buffer, 0, readCount);
			}
		} catch (Exception ex) {
			throw new RuntimeException("file Save Error");
		}

	}
	
	
	/*채팅방 생성 (post)*/
	@PostMapping("/addChatRoom")
	public String addChatRoom(HttpSession session
							, Chat chat
							, RedirectAttributes reAttr
							, @RequestParam MultipartFile[] chatImgFile
							, HttpServletRequest request) {
		
		String serverName = request.getServerName();
		String sessionId = (String) session.getAttribute("UID");
		
		System.out.println(chatImgFile  + "-------------------------------chatImgFile---------------------------");
		
		String fileRealPath = "";

		if ("localhost".equals(serverName)) {
			// server 가 localhost 일때 접근
			fileRealPath = System.getProperty("user.dir") + "/src/main/resources/static/";
			System.out.println(System.getProperty("user.dir"));
			// fileRealPath =
			// request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		} else {
			// 배포용 주소
			fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}
		String chatRoomCode = chatService.addChatRoom(sessionId, chat, chatImgFile, fileRealPath);
		log.info("chatRoomCode : {}", chatRoomCode);
		log.info(fileRealPath);
		
		reAttr.addAttribute("chatRoomCode", chatRoomCode);
		
		return "redirect:/userpage/chat/chatRoomList";
	}
	
	/*채팅방 생성 (get)*/
	@GetMapping("/addChatRoom")
	public String addChatRoom(Model model
							, HttpSession session) {
		
		List<Chat> chatRoomList = chatService.getChatRoomList();
		model.addAttribute("chatRoomList", chatRoomList);
		
		return "userpage/chat/addChatRoom";
	}
	
	/*채팅방 목록 조회*/
	@GetMapping("/chatRoomList")
	public String getChatRoomList(Model model) {
		
		List<Chat> chatRoomList = chatService.getChatRoomList();
		
		log.info("chatRoomList : {}", chatRoomList);
		
		model.addAttribute("chatRoomList", chatRoomList);
		
		return "userpage/chat/chatRoomList";
		
	}
	
}
