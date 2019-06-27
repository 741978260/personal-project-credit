package com.mumu.customercenter.service;

import com.mumu.customercenter.domain.Quota;

/**
 * <p></p>
 * Created by Mumu on 2019/6/28
 */
public interface CreditQuotaService {
    Quota query(Long id);
}
