package com.itheima.demo;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        // 商品类型的数组  这个商品类型是引用类型
        Goods[] shopCar = new Goods[100];  // [null,null]

        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车商品：query");
            System.out.println("修改商品购买数量：updata");
            System.out.println("结算购买商品金额：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入命令：");
            String command =  sc.next();
            switch (command){
                case "add":
                    addGoods(shopCar,sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
            }
        }
    }

    private static void updateGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("要修改的商品的ID:");
        int id = sc.nextInt();
        Goods g = getGoodsById(shopCar,id);
        if (g == null){
            // 没有该商品
            System.out.printf("没有该商品！");
        }else{
            // 修改商品
            System.out.println("修改后的数量:");
            int buyNumber = sc.nextInt();
            g.buyNumber = buyNumber;
            System.out.println("-------------------------");
            System.out.println("商品修改完成");
            queryGoods(shopCar);
        }
    }

    // 注意这个类型填Goods 因为要返回的是对象，这个Goods是自定义的引用数据类型
    private static Goods getGoodsById(Goods[] shopCar,int id){
        for (int i = 0;i < shopCar.length;i++){
            if (shopCar[i] != null){
                if (shopCar[i].id == id){
                    return shopCar[i];
                }
            }else {
                System.out.println("没有找到商品");
                return null;    // 找完了前面存在的商品，都没有找到
            }
        }
        return null;        // 代表找完了 100 个商品 都没有找到id 一样的商品
    }

    private static void payGoods(Goods[] shopCar) {
    }

    private static void queryGoods(Goods[] shopCar) {
        // 查询购物车信息
        System.out.println("===============查询购物车信息如下===============");
        System.out.println("编号\t\t名称\t\t价格\t\t数量\t\t");
        for (int i = 0;i<shopCar.length;i++){
            if (shopCar[i] != null){
                // 每一个商品进行打印展示
                System.out.println(shopCar[i].id + "\t\t" + shopCar[i].name + "\t\t" + shopCar[i].price + "\t\t" + shopCar[i].buyNumber);
            }else{
                break;
            }
        }
    }

    private static void addGoods(Goods[] shopCar,Scanner sc) {
        // 完成商品添加到购物车功能
        System.out.println("请输入购买的商品编号：");
        int id = sc.nextInt();
        System.out.println("请输入购买的商品的名称：");
        String name = sc.next();
        System.out.println("请输入购买的商品价格：");
        double price = sc.nextDouble();
        System.out.println("请输入购买的商品的数量：");
        int buyNumber = sc.nextInt();

        // 把这些购买商品的信息封装成商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        // 存入商品对象
        for (int i =0;i < shopCar.length;i++){
            if (shopCar[i] == null){
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品" + g.name + "成功添加到购物车！");
        System.out.println("----------------------------------");
    }
}
