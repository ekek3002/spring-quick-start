package com.springbook.biz.board;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class BoardVO {

    @XmlAttribute
    private int seq;
    private String title;
    private String writer;
    private String content;
    private Date regDate;
    private int cnt;
    @XmlTransient
    private String searchCondition;
    @XmlTransient
    private String searchKeyword;
    @XmlTransient
    private MultipartFile uploadFile;

//    @JsonIgnore
    public MultipartFile getUploadFile() {
        return uploadFile;
    }

//    @JsonIgnore
    public void setUploadFile(MultipartFile uploadFile) {
        this.uploadFile = uploadFile;
    }

//    @JsonIgnore
    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

//    @JsonIgnore
    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "seq=" + seq +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", regDate=" + regDate +
                ", cnt=" + cnt +
                '}';
    }
}
