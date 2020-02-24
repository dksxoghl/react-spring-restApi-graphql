package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

/**
 * WEB Rest Controller
 *
 * @author taehi
 */
@RestController
public class WebController {

    @Autowired
    private CategoryDAO categoryDAO;

    /**
     * Get All Category Data
     *
     * @return
     */
    @GetMapping("/category/list")
    public Iterable<CategoryEntity> getList() {
        return categoryDAO.findAllByOrderByOrder();
    }
//    private Sort sortByIdAsc() {
//        return new Sort(Sort.Direction.ASC, "id");
//    }

//    /**
//     * View specific Category by id
//     *
//     * @param id
//     * @return
//     */
//    @GetMapping("/category/{id}")
//    public CategoryEntity getDetail(@PathVariable String id) {
//        return categoryDAO.findById(id).orElse(null);
//    }

    /**
     * New Category Data
     *
     * @param param
     * @return
     */
    @Transactional
    @PostMapping("/category")
    public CategoryEntity addCategory(@RequestBody CategoryEntity param) {
        //        tx.begin();
////        User user = new User("910527-1234567", "도로락", "서울특별시"); //식별자를 직접 할당
//        em.persist(param); //영속성 컨텍스트에 persist()
//        tx.commit();
        return categoryDAO.save(param);
    }

    /**
     * Modify Category Data
     *
     * @param param
     * @return
     */
    @Transactional
    @PutMapping("/category/{id}")
    public CategoryEntity modifyCategory(@RequestBody CategoryEntity param) {
        return categoryDAO.save(param);
    }

    /**
     * Delete Book Data
     *
     * @param id
     * @return
     */
    @Transactional
    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable String id) {
        categoryDAO.deleteById(id);
//        return "SUCCESS";

    }
}


