package com.mumu.customercenter.dao.credit;

import com.mumu.customercenter.domain.Quota;
import com.mumu.customercenter.mapper.credit.QuotaMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * <p></p>
 * Created by Mumu on 2019/6/28
 */
@Repository
public class QuotaDao extends SuperDao<QuotaMapper, Quota> {
    public Quota query(Long id) {
        List<Quota> quotas = find(new Quota(id));
        return CollectionUtils.isEmpty(quotas) ? null : quotas.get(quotas.size() - 1);
    }
}
