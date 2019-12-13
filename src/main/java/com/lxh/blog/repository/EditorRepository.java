package com.lxh.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxh.blog.domain.Editor;

/**
 * Created on 2018/3/4 0004.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface EditorRepository extends JpaRepository<Editor, Integer> {
}
