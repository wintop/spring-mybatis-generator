package net.hyjuki.smgen.base;

import net.hyjuki.smgen.base.utils.GenUtils;
import net.hyjuki.smgen.base.utils.JavaConstants;

public class BaseProject {
    // BaseDao的包
    String baseDaoPkg;
    // BaseService的包
    String baseSevicePkg;
    // model的包名
    String modelPkg;
    // dao的包名
    String daoPkg;
    // service的包名
    String servicePkg;
    // service implement的包名
    String implPkg;
    // controller的包名
    String ctrlPkg;

    public void init(String pkgName) {
        baseDaoPkg = GenUtils.concatPackage(pkgName,
                JavaConstants.DIR_BASE, JavaConstants.DIR_DAO);
        baseSevicePkg = GenUtils.concatPackage(pkgName,
                JavaConstants.DIR_BASE, JavaConstants.DIR_SERVICE);
        modelPkg = GenUtils.concatPackage(pkgName, JavaConstants.DIR_MODEL);
        daoPkg = GenUtils.concatPackage(pkgName, JavaConstants.DIR_DAO);
        servicePkg = GenUtils.concatPackage(pkgName, JavaConstants.DIR_SERVICE);
        implPkg = GenUtils.concatPackage(servicePkg, JavaConstants.DIR_IMPL);
        ctrlPkg = GenUtils.concatPackage(pkgName, JavaConstants.DIR_CONTROLLER);
        this.setBaseInfo();
    }

    private void setBaseInfo() {
        // generator BaseDao
        // generator BaseService
        // generator GenericService
        // generator cofig/config.xml
    }

    public String getBaseDaoPkg() {
        return baseDaoPkg;
    }

    public void setBaseDaoPkg(String baseDaoPkg) {
        this.baseDaoPkg = baseDaoPkg;
    }

    public String getBaseSevicePkg() {
        return baseSevicePkg;
    }

    public void setBaseSevicePkg(String baseSevicePkg) {
        this.baseSevicePkg = baseSevicePkg;
    }

    public String getModelPkg() {
        return modelPkg;
    }

    public void setModelPkg(String modelPkg) {
        this.modelPkg = modelPkg;
    }

    public String getDaoPkg() {
        return daoPkg;
    }

    public void setDaoPkg(String daoPkg) {
        this.daoPkg = daoPkg;
    }

    public String getServicePkg() {
        return servicePkg;
    }

    public void setServicePkg(String servicePkg) {
        this.servicePkg = servicePkg;
    }

    public String getImplPkg() {
        return implPkg;
    }

    public void setImplPkg(String implPkg) {
        this.implPkg = implPkg;
    }

    public String getCtrlPkg() {
        return ctrlPkg;
    }

    public void setCtrlPkg(String ctrlPkg) {
        this.ctrlPkg = ctrlPkg;
    }
}
