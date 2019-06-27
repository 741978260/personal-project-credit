package com.mumu.customercenter.dao.credit;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @author Isaac
 * @description ---------------------------------
 * @date 12/5/2018 17:29
 */
class SuperDao<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {
    protected List<T> find(final T obj) {
        return super.list(new Wrapper<T>() {
            private static final long serialVersionUID = 620139204341485003L;

            @Override
            public T getEntity() {
                return obj;
            }

            @Override
            public MergeSegments getExpression() {
                return null;
            }

            public String getSqlSegment() {
                return null;
            }
        });
    }

    protected T findOne(final T obj) {
        return super.getOne(new Wrapper<T>() {
            @Override
            public T getEntity() {
                return obj;
            }

            @Override
            public MergeSegments getExpression() {
                return null;
            }

            public String getSqlSegment() {
                return null;
            }
        }, true);
    }
}
