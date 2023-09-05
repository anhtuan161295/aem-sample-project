package com.company.demo.core.pojo;

import java.util.ArrayList;
import java.util.List;

import com.adobe.cq.sightly.WCMUsePojo;
import com.google.gson.JsonArray;
import com.company.demo.core.bean.Country;
import com.company.demo.core.config.IDemoConfiguration;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class DemoConfigurationComponent extends WCMUsePojo {

//    @Reference(target = ConstantsHelper.SERVICE_CONFIGURATION_PID)
//    private IDemoConfiguration demoConfiguration;

    private List<Country> list;

    @Override
    public void activate() throws Exception {

        BundleContext bContext = FrameworkUtil.getBundle(IDemoConfiguration.class).getBundleContext();
        ServiceReference sr = bContext.getServiceReference(IDemoConfiguration.class.getName());
        IDemoConfiguration demoConfiguration = (IDemoConfiguration) bContext.getService(sr);

//        SlingScriptHelper helper = getSlingScriptHelper();
//        IDemoConfiguration demoConfiguration = helper.getService(IDemoConfiguration.class) ;

        String[] data = demoConfiguration.getData();
        list = new ArrayList<Country>();
        JsonArray l = new JsonArray();
        for (String s : data) {
            Country c = new Country(s, s);
            list.add(c);
        }

//        ResourceResolver resolver = this.getResourceResolver();
//        List<Resource> fakeResourceList = new ArrayList<Resource>();
//        for (Country item : list) {
//            ValueMap vm = new ValueMapDecorator(new HashMap());
//            vm.put("text", item.getValue());
//            vm.put("value", item.getValue());
//            fakeResourceList.add(new ValueMapResource(resolver, new ResourceMetadata(), "nt:unstructured", vm));
//
//            getResponse().getWriter().print(item.getCode());
//        }

//        DataSource ds = new SimpleDataSource(fakeResourceList.iterator());
//        this.getRequest().setAttribute(DataSource.class.getName(), ds);

    }

    public List<Country> getList() {
        return list;
    }
}
