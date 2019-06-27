package com.mumu.customercenter.service.impl;

import com.mumu.customercenter.dao.credit.QuotaDao;
import com.mumu.customercenter.domain.Quota;
import com.mumu.customercenter.service.CreditQuotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 * Created by Mumu on 2019/6/28
 */
@Service
@RequiredArgsConstructor
public class CreditQuotaServiceImpl implements CreditQuotaService {
    private final QuotaDao quotaDao;
    public Quota query(Long id) {
        return quotaDao.query(id);
    }
}
