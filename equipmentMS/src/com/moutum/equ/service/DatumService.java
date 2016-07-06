package com.moutum.equ.service;

import java.util.List;
import java.util.Map;

import com.moutum.equ.domain.Datum;
import com.moutum.equ.dto.PageBean;

/********************************************************************************
 * @Title        : DatumService.java
 * @Description : 
 * @Author       : BianWeiqing
 * @DateTime     : 2015-3-28 下午09:48:38
 * @Copyright    : 2015 Moutum All Rights Reserved
 * @version      : V1.0
 ********************************************************************************/
public interface DatumService
{

    /********************************************************************************
     * 根据查询条件获取PageBean
     * @param pageNum
     * @param pageSize
     * @param requestType "rele":设备管理文档请求 "list":文档管理的查看请求
     * @return
     ********************************************************************************/
    PageBean getPage(int pageNum, int pageSize, Map<String, Object> map, String requestType);

    /********************************************************************************
     * 添加文档
     * @param datum
     * @return 1:成功, 0:文档已经存在, -1:操作失败
     ********************************************************************************/
    int save(Datum datum, String[] es);

    /********************************************************************************
     * 修改文档
     * @param datum
     * @return 1:成功, 0:文档不存在, -1:操作失败
     ********************************************************************************/
    int modify(Datum datum);

    /********************************************************************************
     * 删除文档
     * @param datumId
     * @return 1:成功, 0:文档不存在, -1:操作失败
     ********************************************************************************/
    int delete(int datumId);
    
    /********************************************************************************
     * 获取文档类型,格式的信息
     * @return
     ********************************************************************************/
    Map<String, List<?>> getSelectLists();
    
    /********************************************************************************
     * 根据文档路径,文档名查询文档
     * @param datum
     * @return
     ********************************************************************************/
    boolean select(String datumName, String datumPath);

    /********************************************************************************
     * 根据查询条件获取PageBean
     * @param pageNum
     * @param pageSize
     * @return
     ********************************************************************************/
    PageBean getPage(int pageNum, int pageSize, long equipmentId);

    Datum select(long datumId);

    /********************************************************************************
     * 根据设备ID查询设备的关联图片
     * @param equipmentId
     * @return
     ********************************************************************************/
    List<Datum> selectImage(long equipmentId);
}
