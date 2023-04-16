package com.myblog.service;

import com.myblog.payload.PostDto;
import com.myblog.payload.PostResponse;

public interface PostService {
  PostDto cratePost(PostDto postDto);

  PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

  PostDto getPostById(Long id);

  PostDto updatePost(PostDto postDto, long id);

  void deleteById(long id);
}
