package cn.bdqn.Controller;


import cn.bdqn.domain.ItemTypes;
import cn.bdqn.domain.PeItems;
import cn.bdqn.service.ItemTypesService;
import cn.bdqn.service.PeItemsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/physical/")
public class PhysicalController {

    @Autowired
    private ItemTypesService itemTypesService;
    @Autowired
    private PeItemsService peItemsService;


    @RequestMapping("/query")
    public String select(Integer typeId,String page, ModelMap modelMap){

        try{
            //判断当前页是否为空
            if (page==null){
                page = "1";
            }
            //开启分页
            PageHelper.startPage(Integer.parseInt(page),1);
            //把查到的数据放到分页插件中
            PageInfo<PeItems> peItems = new PageInfo<>(peItemsService.queryByTypeId(typeId));
            //查询全部类型
            List<ItemTypes> itemTypes = itemTypesService.queryAll();
            modelMap.addAttribute("itemTypes",itemTypes);
            modelMap.addAttribute("peItems",peItems);
            modelMap.addAttribute("typeId",typeId);
            return "physical";
        }catch (Exception e){
            e.printStackTrace();
            return "massage";
        }
    }
    @RequestMapping("/addUpdateUl")
    public String AddUpdateUl(String intemId,ModelMap modelMap){
        try {
            //查询单个用户
            PeItems peItems =  peItemsService.queryByIntemId(Integer.parseInt(intemId));
            List<ItemTypes> itemTypesList = itemTypesService.queryAll();
            modelMap.addAttribute("peItem",peItems);
            modelMap.addAttribute("itemTypesList",itemTypesList);
            return "update";
        }catch (Exception e){
            e.printStackTrace();
            return "massage";
        }
    }

    @RequestMapping("/update")
    public String update(PeItems peItems){

        try {
            if(peItems.getNecessary()==null){
                peItems.setNecessary(2);
            }
            peItemsService.updateByPeItems(peItems);
            return "forward:/physical//query";
        }catch (Exception e){
            e.printStackTrace();
            return "massage";
        }
    }

    @RequestMapping("/addSaveUl")
    public String addSaveUl(ModelMap modelMap){
        try{
            List<ItemTypes> itemTypes = itemTypesService.queryAll();
            modelMap.addAttribute("items",itemTypes);
            return "save";
        }catch (Exception e){
            e.printStackTrace();
            return "massage";
        }
    }


    @RequestMapping("/save")
    public String save(PeItems peItems){
        try {
            if(peItems.getNecessary()==null){
                peItems.setNecessary(2);
            }
            peItemsService.save(peItems);
            return "forward:/physical//query";
        }catch (Exception e){
            e.printStackTrace();
            return "massage";
        }
    }

    @RequestMapping("/delete")
    public String delete(Integer intemId){
        try {
            peItemsService.deleteByIntemId(intemId);
            return "forward:/physical//query";
        }catch (Exception e){
            e.printStackTrace();
            return "massage";
        }
    }
}
