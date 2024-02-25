package com.sh.app.answer.controller;

import com.sh.app.answer.entity.Answer;
import com.sh.app.answer.service.AnswerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/askDetail.do")
    public void createAnswer() {

    }
//    @PostMapping("/createAnswer.do")
//    public String createAnswer(@Valid AnswerCreateDto answerCreateDto,
//                               BindingResult bindingResult,
//                               RedirectAttributes redirectAttributes) {
//        if (bindingResult.hasErrors()) {
//            throw new RuntimeException(bindingResult.getAllErrors().get(0).getDefaultMessage());
//        }
//
//        answerService.createAnswer(answerCreateDto);
//
//        redirectAttributes.addFlashAttribute("msg", "답변을 작성했습니다.");
//
//        return "redirect:/ask/askList.do";
//    }


    @GetMapping("/findAnswerByAskId/{askId}")
    public ResponseEntity<List<Answer>> findAnswerByAskId(@PathVariable Long askId) {
        List<Answer> answers = answerService.findAnswerByAskId(askId);
        return ResponseEntity.ok().body(answers);
    }
//    @GetMapping("/answerDetail.do={askId}")
//    public List<Answer> findAnswerByAskId(@PathVariable Long askId) {
//        return answerService.findAnswerByAskId(askId);
//    }
}
