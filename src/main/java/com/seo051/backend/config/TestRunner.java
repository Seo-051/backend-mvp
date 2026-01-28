//package com.seo051.backend.config;
//
//import com.seo051.backend.domain.post.Post;
//import com.seo051.backend.domain.post.PostRepository;
//import com.seo051.backend.domain.user.User;
//import com.seo051.backend.domain.user.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@RequiredArgsConstructor
//public class TestRunner implements CommandLineRunner {
//
//    private final UserRepository userRepository;
//    private final PostRepository postRepository;
//
//    @Override
//    public void run(String... arg) {
//        if(userRepository.findByEmail("test4@test.com").isPresent()){
//            return;
//        }
//
//        User user = new User(
//            "test3@test.com",
//            "hashed-password",
//            "테스트 유저"
//        );
//
//        userRepository.save(user);
//
//        Post post = new Post(
//                "첫 글",
//                "jpa 테스트용 글",
//                user
//        );
//
//        postRepository.save(post);
//
//        System.out.println("=== 저장 완료 ===");
//    }
//}
