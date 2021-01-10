package com.xseven.bigfileupload.service;

import com.xseven.bigfileupload.constant.FileConstant;
import com.xseven.bigfileupload.domain.FileTb;
import com.xseven.bigfileupload.mapper.FileTbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class FileTbService {
    @Autowired
    private FileTbMapper fileTbMapper;

    public void saveFile(FileTb fileTb) {
        fileTbMapper.insert(fileTb);
    }

    public void UpdateFile(FileTb fileTb) {
        fileTbMapper.UpdateFile(fileTb);
    }

    public boolean isNotExist(String key){
        Integer id = fileTbMapper.isExist(key);
        if (ObjectUtils.isEmpty(id)) {
            return true;
        }
        return false;
    }
    public FileTb selectLatestIndex(String key) {
        FileTb fileTb = fileTbMapper.selectLatestIndex(key);
        if (ObjectUtils.isEmpty(fileTb)) {
            fileTb = FileTb.builder().fKey(key).fIndex(-1).fName("").build();
        }else {
            fileTb.setFName(FileConstant.ACCESS_PATH+fileTb.getFName());
        }
        return fileTb;
    }


    public List<FileTb> selectAll() {
        List<FileTb> list = fileTbMapper.selectList(null);
        return list;
    }
}
