Code đọc csv, lấy json từ url, đọc dữ liệu từ node nằm trong mydemo.core package servlet  
Trong folder servlet có các file servlet dùng để test xem code lấy được dữ liệu lên web chưa.  
Trong folder pojo là các component dùng cho các component bên ui.apps  
Trong folder utils là các class đọc file rút gọn từ servlet  

Trong ui.content jcr_root/content/dam/mydemo chứa hình ảnh,file csv trong folder data

Trong ui.apps có component person để hiển thị json từ url  
helloworld2 để test các control up hình, select

apps/mydemo/components/democonfiguration là dropdownlist có datasource = jsp  
apps/mydemo/config.author/ DemoConfiguration.xml là file config có data   
mydemo.core / servlets / democonfiguration là datasource = servlet  
