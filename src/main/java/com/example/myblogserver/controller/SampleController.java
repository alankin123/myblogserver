package com.example.myblogserver.controller;

import com.example.myblogserver.model.Article;
import com.example.myblogserver.model.Subject;
import com.example.myblogserver.service.ArticleService;
import com.example.myblogserver.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private SubjectService subjectService;

   /* @ResponseBody
    @GetMapping("/getArticle")
    public Object findArticle(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        return articleService.getArticle(pageNum, pageSize);
    }

    @ResponseBody
    @PostMapping("/addArticle")
    public Object addArticle(ArticleWithBLOBs article) {
        article.setId(3);
        article.setCreatetime("2018-5-2 14:11");
        article.setTitle("Test");
        article.setBrief("333333");
        return articleService.addArticle(article);
    }

    //图片保存
    @RequestMapping("/editormdPic")
    @ResponseBody
    public JSONObject editormdPic(@RequestParam(value = "editormd-image-file",
            required = true) MultipartFile file,
                                  HttpServletRequest request,
                                  HttpServletResponse response) throws Exception {
        String trueFileName = file.getOriginalFilename();
        String suffix = trueFileName.substring(trueFileName.lastIndexOf("."));
        String fileName = System.currentTimeMillis() + "_" + suffix;
        String path = request.getSession().getServletContext().getRealPath("/assets/msg/upload/");
        System.out.println(path);

        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JSONObject res = new JSONObject();
        res.put("url", "/");
        res.put("success", 1);
        res.put("message", "upload success!");
        return res;
    }*/

    // 新增文集
    @ResponseBody
    @PostMapping("/addSubject")
    public Object addSubject(Subject subject) {
        subject.setId(1);
        return subjectService.addSubject(subject);
    }

    //删除文集
    @ResponseBody
    @PostMapping("/delSubject")
    public Object delSubject(int id) {
        return subjectService.delSubject(id);
    }

    //更新文集
    @ResponseBody
    @PostMapping("/updateSubject")
    public Object updateSubject(Subject subject) {
        return subjectService.updateSubject(subject);
    }

    //查询文集
    @ResponseBody
    @PostMapping("/findSubject")
    public Object findSubject(int id) {
        return subjectService.findSubject(id);
    }

    //发布文集
    @ResponseBody
    @PostMapping("/subscribSubject")
    public Object subscribSubject(int id) {
        return subjectService.subscribSubject(id);
    }

    //新增文章
    @ResponseBody
    @PostMapping("/addArticle")
    public Object addArticle(Article article) {
        article.setId(1);
        return articleService.addArticle(article);
    }

    //删除文章
    @ResponseBody
    @PostMapping("/delArticle")
    public Object delArticle(int id) {
        return articleService.delArticle(id);
    }

    //更新文章
    @ResponseBody
    @PostMapping("/updateArticle")
    public Object updateArticle(Article article) {
        return articleService.updateArticle(article);
    }

    //查询文章
    @ResponseBody
    @PostMapping("/findArticle")
    public Object findArticle(int id) {
        return articleService.findArticle(id);
    }

    //发布文章
    @ResponseBody
    @PostMapping("/subscribArticle")
    public Object subscribArticle(int id) {
        return articleService.subscribArticle(id);
    }
}
