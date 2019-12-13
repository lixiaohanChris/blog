package com.lxh.blog.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxh.blog.domain.Editor;
import com.lxh.blog.repository.EditorRepository;
import com.lxh.blog.service.EditorService;

/**
 * Created on 2018/3/4 0004.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Service
public class EditorServiceImpl implements EditorService {

    @Autowired
    private EditorRepository repository;


    @Override
    public void save(Editor editor) {
        repository.save(editor);
    }

    @Override
    public Editor findOne(int id) {
        return repository.findOne(id);
    }
}
