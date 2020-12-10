package com.dqdl.community.domain.service.factory;

import com.dqdl.community.domain.model.user.PostAuthor;
import com.dqdl.community.domain.repository.IPostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kai
 * http://jessehzx.top/2018/03/18/spring-autowired-static-field/
 */

@Component
public class PostAuthorFactory {

  private static final Logger log = LoggerFactory.getLogger(PostAuthorFactory.class);

  private static IPostRepository postRepository;

  @Autowired
  public PostAuthorFactory(IPostRepository postRepository) {
    PostAuthorFactory.postRepository = postRepository;
  }

  public static PostAuthor createPostAuthor(long id) {
    return new PostAuthor(id, postRepository);
  }
}
