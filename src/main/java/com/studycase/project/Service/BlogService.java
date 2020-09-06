package com.studycase.project.Service;

import com.studycase.project.domain.Blog;

import java.util.Collection;

public interface BlogService {
    public abstract void createBlog(Blog blog);
    public abstract void updateBlog(String id, Blog blog);
    public abstract void deleteBlog(String id);
    public abstract Collection<Blog> getBlogs();
}
