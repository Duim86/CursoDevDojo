package com.devdojo.springboot2.mapper;

import com.devdojo.springboot2.domain.Anime;
import com.devdojo.springboot2.requests.AnimePostRequestBody;
import com.devdojo.springboot2.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeMapper {
  AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);
  Anime toAnime(AnimePostRequestBody animePostRequestBody);

  Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
