package com.lxh.blog.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.lxh.blog.domain.Editor;
import com.lxh.blog.domain.Result;
import com.lxh.blog.service.EditorService;
import com.lxh.blog.util.ResultUtil;

import java.util.Map;

/**
 * Created on 2018/3/2 0002.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Controller
@RequestMapping("/editorWeb")
@Slf4j
public class EditorController {

    @Autowired
    private EditorService editorService;

    @PostMapping
    @ResponseBody
    public Result saveEditor(Editor editor) {
        log.info(editor.toString());
        editorService.save(editor);
        return ResultUtil.success();
    }

    /**
     * 预览
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/preview/{id}")
    public ModelAndView preview(@PathVariable(value = "id") int id, Map map) {

        Editor editor = editorService.findOne(id);

        map.put("editor", editor);
        return new ModelAndView("preview", map);
    }

    /**
     * 编辑
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(value = "id") int id, Map map) {

        Editor editor = editorService.findOne(id);

        map.put("editor", editor);
        return new ModelAndView("index", map);
    }
}
