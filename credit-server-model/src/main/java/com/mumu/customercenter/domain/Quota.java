package com.mumu.customercenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p></p>
 * Created by Mumu on 2019/6/28
 */
@Data
@NoArgsConstructor
@TableName("t_credit_quota")
public class Quota {
    private Long id;
    private Integer jobId;
    private String glueType;
    private String glueRemark;
    private Date addTime;
    private Date updateTime;

    public Quota(Long id) {
        this.id = id;
    }
}
