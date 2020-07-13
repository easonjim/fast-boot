package com.domain.common.validator.group;

import javax.validation.GroupSequence;

/**
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 *
 * @author jim
 * @date 2020/07/13
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
