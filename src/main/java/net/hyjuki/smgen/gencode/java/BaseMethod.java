package net.hyjuki.smgen.gencode.java;

/**
 * 基本的方法：
 *      get：获取单条记录；
 *      find：查找多条记录；
 *      save：增加新的记录；
 *      update：修改记录；
 *      remove：删除一条记录；
 *      findForPage：分页查询
 */
public enum  BaseMethod {
    get, find, save, update, remove, list, add, edit, edit_status;
}
