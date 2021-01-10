package com.xseven.bigfileupload.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xseven.bigfileupload.domain.FileTb;
import org.apache.ibatis.annotations.Param;

public interface FileTbMapper extends BaseMapper<FileTb> {
    void UpdateFile(@Param("fileTb") FileTb fileTb);

    Integer isExist(@Param("key") String key);

    FileTb selectLatestIndex(@Param("key") String key);
}