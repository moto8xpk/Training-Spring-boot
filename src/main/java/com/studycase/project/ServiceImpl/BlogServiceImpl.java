package com.studycase.project.ServiceImpl;

import com.studycase.project.Service.BlogService;
import com.studycase.project.domain.Blog;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class BlogServiceImpl implements BlogService {

    private static Map<String, Blog> blogRepo = new HashMap<>();
    static {
        Blog honey = new Blog();
        honey.setId("1");
        honey.setName("Honey");
        blogRepo.put(honey.getId(), honey);

        Blog almond = new Blog();
        almond.setId("2");
        almond.setName("Almond");
        blogRepo.put(almond.getId(), almond);
    }
    @Override
    public void createBlog(Blog blog) {
        blogRepo.put(blog.getId(), blog);
    }

    @Override
    public void updateBlog(String id, Blog blog) {
        blogRepo.remove(id);
        blog.setId(id);
        blogRepo.put(id, blog);
    }

    @Override
    public void deleteBlog(String id) {
        blogRepo.remove(id);
    }

    @Override
    public Collection<Blog> getBlogs() {
        return blogRepo.values();
    }
}
