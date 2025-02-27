package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-08
 */
public class KechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private String kechengName;


    /**
     * 课程类型
     */
    private Integer xuekeTypes;


    /**
     * 课程时间
     */
    private String kechengShijian;


    /**
     * 上课教师
     */
    private Integer jiaoshiId;


    /**
     * 详情信息
     */
    private String kechengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getXuekeTypes() {
        return xuekeTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setXuekeTypes(Integer xuekeTypes) {
        this.xuekeTypes = xuekeTypes;
    }
    /**
	 * 获取：课程时间
	 */
    public String getKechengShijian() {
        return kechengShijian;
    }


    /**
	 * 设置：课程时间
	 */
    public void setKechengShijian(String kechengShijian) {
        this.kechengShijian = kechengShijian;
    }
    /**
	 * 获取：上课教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：上课教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：详情信息
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
