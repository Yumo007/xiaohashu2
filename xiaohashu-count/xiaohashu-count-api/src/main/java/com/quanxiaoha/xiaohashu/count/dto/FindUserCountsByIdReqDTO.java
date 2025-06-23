package com.quanxiaoha.xiaohashu.count.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 犬小哈
 * @date: 2024/4/7 15:17
 * @version: v1.0.0
 * @description: 查询用户维度相关计数
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserCountsByIdReqDTO {

    /**
     * 用户 ID
     */
    @NotNull(message = "用户 ID 不能为空")
    private Long userId;

}
