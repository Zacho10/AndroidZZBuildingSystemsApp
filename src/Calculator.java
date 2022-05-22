
public class Calculator {
    int width ;
    int height ;
    String doorType;

    public static double calculatePrice(int width , int height,String doorType) {
         double price = 0.0;
        switch (doorType) {
            case "1ei60":
                if (height == 2000) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width >= 670 && width <= 795) {
                        price = 305.98;
                    } else if (width >= 805 && width <= 895) {
                        price = 318.95;
                    } else if (width >= 905 && width <= 995) {
                        price = 330.85;
                    }else if (width >= 670 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height == 2050) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1100) {
                        price = 362.20;
                    } else if (width == 1200) {
                        price = 382.74;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width == 1340) {
                        price = 422.75;
                    } else if (width >= 670 && width <= 795) {
                        price = 305.98;
                    } else if (width >= 805 && width <= 895) {
                        price = 318.95;
                    } else if (width >= 905 && width <= 995) {
                        price = 330.85;
                    }else if (width >= 670 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height == 2100) {
                    if (width == 800) {
                        price = 311.39;
                    } else if (width == 900) {
                        price = 323.28;
                    } else if (width == 1000) {
                        price = 337.33;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340){ price = 438.97;
                    }else if (width >= 670 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }


                } else if (height == 2150) {
                    if (width == 800) {
                        price = 294.09;
                    } else if (width == 900) {
                        price = 305.98;
                    } else if (width == 1000) {
                        price = 320.04;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340) {
                        price = 438.97;
                    } else if (width >= 670 && width <= 795) {
                        price = 315.71;
                    } else if (width >= 805 && width <= 895) {
                        price = 326.52;
                    } else if (width >= 905 && width <= 995) {
                        price = 339.50;
                    }else if (width >= 670 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                } else if (height == 2200) {
                    if (width == 800) {
                        price = 322.20;
                    } else if (width == 900) {
                        price = 338.42;
                    } else if (width == 1000) {
                        price = 354.63;
                    } else if (width == 1100) {
                        price = 414.10;
                    } else if (width == 1200) {
                        price = 437.89;
                    } else if (width == 1300) {
                        price = 470.32;
                    } else if (width == 1340) {
                        price = 476.81;
                    }else if (width >= 670 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }

                } else if (height >= 1950 && height <= 2050) {
                    if (width >= 670 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 670 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 670 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 670 && width <= 900) {
                        price = 419.51;
                    } else if (width >= 901 && width <= 1125) {
                        price = 450.86;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 493.03;
                    }
                } else if (height >= 2501 && height <= 2600) {
                    if (width >= 670 && width <= 900) {
                        price = 435.72;
                    } else if (width >= 901 && width <= 1125) {
                        price = 493.03;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 549.25;
                    }
                }
                break;
            case "2ei60":
                if (height == 2000|| height ==2050) {
                    if (width == 1150) {
                        price = 556.50;
                    } else if (width == 1200) {
                        price = 563.92;
                    } else if (width == 1250) {
                        price = 569.22;
                    } else if (width == 1300) {
                        price = 574.52;
                    } else if (width == 1350) {
                        price = 581.94;
                    } else if (width == 1400) {
                        price = 590.42;
                    } else if (width == 1450) {
                        price = 596.78;
                    } else if (width == 1600) {
                        price = 615.86;
                    } else if (width == 1700) {
                        price = 628.58;
                    } else if (width == 1800) {
                        price = 638.12;
                    } else if (width == 1900) {
                        price = 654.02;
                    } else if (width == 2000) {
                        price = 667.80;
                    }else if (width >= 890 && width <= 1280) {
                        price = 596.78;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 609.50;
                    } else if (width >= 1381&& width <= 1480) {
                        price = 625.40;
                    }else if (width >= 1481 && width <= 1600) {
                        price = 629.64;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 651.90;
                    } else if (width >= 1801&& width <= 2000) {
                        price = 678.40;
                    }else if(width>=2001 && width<= 2200){
                        price = 783.34;
                    }else if(width>=2201 && width<= 2400){
                        price = 803.48;
                    }else if(width>=2401 && width<= 2540){
                        price = 866.02;
                    }
                }else if (height == 2100) {
                    if (width == 1150) {
                        price = 602.08;
                    } else if (width == 1200) {
                        price = 609.50;
                    } else if (width == 1250) {
                        price = 622.22;
                    } else if (width == 1300) {
                        price = 629.64;
                    } else if (width == 1350) {
                        price = 632.82;
                    } else if (width == 1400) {
                        price = 641.30;
                    } else if (width == 1450) {
                        price = 646.60;
                    } else if (width == 1600) {
                        price = 668.86;
                    } else if (width == 1700) {
                        price = 683.70;
                    } else if (width == 1800) {
                        price = 696.42;
                    } else if (width == 1900) {
                        price = 711.26;
                    } else if (width == 2000) {
                        price = 725.04;
                    }else if(width>=890 && width<= 1260){
                        price = 654.02 ;
                    }else if(width>=1261 && width<= 1280){
                        price = 662.50;
                    }else if(width>=1281 && width<= 1380){
                        price = 673.10;
                    }else if(width>=1381 && width<= 1430){
                        price = 676.28;
                    }else if(width>=1431 && width<= 1480){
                        price = 691.12;
                    }else if(width>=1481 && width<= 1530){
                        price = 687.94;
                    }else if(width>=1531 && width<= 1600){
                        price = 694.30;
                    }else if(width>=1601 && width<= 1800){
                        price = 725.04;
                    }else if(width>=1801 && width<= 2000){
                        price = 749.42;
                    }else if(width>=2001 && width<= 2200){
                        price = 805.60;
                    }else if(width>=2201 && width<= 2400){
                        price = 824.68;
                    }else if(width>=2401 && width<= 2540){
                        price = 887.22;
                    }
                }else if (height == 2150) {
                if (width == 1150) {
                    price = 573.46;
                } else if (width == 1200) {
                    price = 581.94;
                } else if (width == 1250) {
                    price = 591.48;
                } else if (width == 1300) {
                    price = 597.84;
                } else if (width == 1350) {
                    price = 602.08;
                } else if (width == 1400) {
                    price = 607.38;
                } else if (width == 1450) {
                    price = 612.68;
                } else if (width == 1600) {
                    price = 633.88;
                } else if (width == 1700) {
                    price = 649.78;
                } else if (width == 1800) {
                    price = 665.68;
                } else if (width == 1900) {
                    price = 675.22;
                } else if (width == 2000) {
                    price = 689.00;
                }else if (width >= 890 && width <= 1280) {
                    price = 610.56;
                } else if (width >= 1281 && width <= 1380) {
                    price = 627.52;
                } else if (width >= 1381&& width <= 1480) {
                    price = 640.24;
                }else if (width >= 1481 && width <= 1600) {
                    price = 651.90;
                } else if (width >= 1601 && width <= 1800) {
                    price = 676.28;
                } else if (width >= 1801&& width <= 2000) {
                    price = 699.60;
                }else if(width>=2001 && width<= 2200){
                    price = 805.60;
                }else if(width>=2201 && width<= 2400){
                    price = 824.68;
                }else if(width>=2401 && width<= 2540){
                    price = 887.22;
                }
                }else if (height == 2200) {
                    if (width == 1150) {
                        price = 630.70;
                    } else if (width == 1200) {
                        price = 638.12;
                    } else if (width == 1250) {
                        price = 649.78;
                    } else if (width == 1300) {
                        price = 660.38;
                    } else if (width == 1350) {
                        price = 665.68;
                    } else if (width == 1400) {
                        price = 670.98;
                    } else if (width == 1450) {
                        price = 674.16;
                    } else if (width == 1600) {
                        price = 698.54;
                    } else if (width == 1700) {
                        price = 716.56;
                    } else if (width == 1800) {
                        price = 730.34;
                    } else if (width == 1900) {
                        price = 743.06;
                    } else if (width == 2000) {
                        price = 757.90;
                    }else if(width>=890 && width<= 1100){
                        price = 693.24;
                    }else if(width>=1101 && width<= 1340){
                        price = 728.22;
                    }else if(width>=1341 && width<= 1800){
                        price = 789.70;
                    }else if(width>=1801 && width<= 2250){
                        price = 867.08;
                    }else if(width>=2251 && width<= 2540){
                        price = 942.34;
                    }
                }else if(height>=1775 && height<=2050){
                    if(width>=890 && width<= 1260){
                        price = 641.30;
                    }else if(width>=1261 && width<= 1280){
                        price = 650.84;
                    }else if(width>=1281 && width<= 1380){
                        price = 662.50;
                    }else if(width>=1381 && width<= 1430){
                        price = 666.74;
                    }else if(width>=1431 && width<= 1480){
                        price = 680.52;
                    }else if(width>=1481 && width<= 1530){
                        price = 682.64;
                    }else if(width>=1531 && width<= 1600){
                        price = 682.84;
                    }else if(width>=1601 && width<= 1800){
                        price = 701.72;
                    }else if(width>=1801 && width<= 2000){
                        price = 727.16;
                    }else if(width>=2001 && width<= 2200){
                        price = 783.34;
                    }else if(width>=2201 && width<= 2400){
                        price = 803.48;
                    }else if(width>=2401 && width<= 2540){
                        price = 866.02;
                    }
                }else if(height>=2051 && height<=2150){
                    if(width>=890 && width<= 1260){
                        price = 654.02 ;
                    }else if(width>=1261 && width<= 1280){
                        price = 662.50;
                    }else if(width>=1281 && width<= 1380){
                        price = 673.10;
                    }else if(width>=1381 && width<= 1430){
                        price = 676.28;
                    }else if(width>=1431 && width<= 1480){
                        price = 691.12;
                    }else if(width>=1481 && width<= 1530){
                        price = 687.94;
                    }else if(width>=1531 && width<= 1600){
                        price = 694.30;
                    }else if(width>=1601 && width<= 1800){
                        price = 725.04;
                    }else if(width>=1801 && width<= 2000){
                        price = 749.42;
                    }else if(width>=2001 && width<= 2200){
                        price = 805.60;
                    }else if(width>=2201 && width<= 2400){
                        price = 824.68;
                    }else if(width>=2401 && width<= 2540){
                        price = 887.22;
                    }
                }else if(height>=2151 && height<=2300){
                    if(width>=890 && width<= 1100){
                        price = 693.24;
                    }else if(width>=1101 && width<= 1340){
                        price = 728.22;
                    }else if(width>=1341 && width<= 1800){
                        price = 789.70;
                    }else if(width>=1801 && width<= 2250){
                        price = 867.08;
                    }else if(width>=2251 && width<= 2540){
                        price = 942.34;
                    }
                }else if(height>=2301 && height<=2500){
                    if(width>=890 && width<= 1100){
                        price = 709.14;
                    }else if(width>=1101 && width<= 1340){
                        price = 749.42;
                    }else if(width>=1341 && width<= 1800){
                        price = 817.26;
                    }else if(width>=1801 && width<= 2250){
                        price = 890.40;
                    }else if(width>=2251 && width<= 2540){
                        price = 972.02;
                    }
                }else if(height>=2501 && height<=2600){
                    if(width>=890 && width<= 1100){
                        price = 766.38;
                    }else if(width>=1101 && width<= 1340){
                        price = 811.96;
                    }else if(width>=1341 && width<= 1800){
                        price = 860.72;
                    }else if(width>=1801 && width<= 2250){
                        price = 974.14;
                    }else if(width>=2251 && width<= 2540){
                        price = 1076.96;
                    }
                }
                break;
            case "2ei90" :
                if (height == 2000|| height ==2050) {
                    if (width == 1600) {
                        price = 866.02;
                    } else if (width == 1700) {
                        price = 879.80;
                    } else if (width == 1800) {
                        price = 895.70;
                    } else if (width == 1900) {
                        price = 910.54;
                    } else if (width == 2000) {
                        price = 923.26;
                    } else if (width >= 1175 && width <= 1260) {
                        price = 831.04;
                    } else if (width >= 1261 && width <= 1600 ) {
                        price = 872.38;
                    } else if (width >= 1601&& width <= 1800) {
                        price = 905.24;
                    }else if(width>=2001 && width<= 2270){
                        price = 1089.68;
                    }else if(width>=2271 && width<= 2400){
                        price = 1102.40;
                    }else if(width>=2401 && width<= 2540){
                        price = 1167.06;
                    }
                }else if (height == 2100) {
                    if (width == 1600) {
                        price = 931.74;
                    } else if (width == 1700) {
                        price = 947.64;
                    } else if (width == 1800) {
                        price = 963.54;
                    } else if (width == 1900) {
                        price = 978.38;
                    } else if (width == 2000) {

                        price = 994.28;
                    }else if(width>=1175 && width<= 1260){
                        price = 895.70;
                    }else if(width>=1261 && width<= 1430){
                        price = 923.26;
                    }else if(width>=1431 && width<= 1530){
                        price = 938.10;
                    }else if(width>=1531 && width<= 1600){
                        price = 942.52;
                    }else if(width>=1601 && width<= 1630){
                        price = 952.94;
                    }else if(width>=1631 && width<= 1800){
                        price = 981.56;
                    }else if(width>=1801 && width<= 2000){
                        price = 1017.60;
                    }else if(width>=2001 && width<= 2270){
                        price = 1109.82;
                    }else if(width>=2271 && width<= 2400){
                        price = 1124.66;
                    }else if(width>=2401 && width<= 2540){
                        price = 1197.80;
                    }
                }else if (height == 2150) {
                        if (width == 1600) {
                            price = 889.34;
                        } else if (width == 1700) {
                            price = 905.24;
                        } else if (width == 1800) {
                            price = 916.90;
                        } else if (width == 1900) {
                            price = 930.68;
                        } else if (width == 2000) {
                            price = 945.52;
                        } else if (width >= 1175 && width <= 1260) {
                            price = 852.24;
                        } else if (width >= 1261 && width <= 1600 ) {
                            price = 895.70;
                        } else if (width >= 1601&& width <= 1800) {
                            price = 923.26 ;
                        }else if(width>=2001 && width<= 2270){
                            price = 1109.82;
                        }else if(width>=2271 && width<= 2400){
                            price = 1124.66;
                        }else if(width>=2401 && width<= 2540){
                            price = 1197.80;
                        }
                }else if (height == 2200) {
                    if (width == 1600) {
                        price = 977.32;
                    } else if (width == 1700) {
                        price = 991.10;
                    } else if (width == 1800) {
                        price = 1007.00;
                    } else if (width == 1900) {
                        price = 1022.90;
                    } else if (width == 2000) {
                        price = 1039.86;
                    }else if(width>=1175 && width<= 1340){
                        price = 1038.80;
                    }else if(width>=1341 && width<= 1800){
                        price = 1096.04;
                    }else if(width>=1801 && width<= 2270){
                        price = 1197.80;
                    }else if(width>=2271 && width<= 2540){
                        price = 1368.46;
                    }
                }else if(height>=1775 && height<=2050){
                    if(width>=1175 && width<= 1260){
                        price = 872.38;
                    }else if(width>=1261 && width<= 1430){
                        price = 905.24;
                    }else if(width>=1431 && width<= 1530){
                        price = 916.90;
                    }else if(width>=1531 && width<= 1600){
                        price = 923.26;
                    }else if(width>=1601 && width<= 1630){
                        price = 930.68;
                    }else if(width>=1631 && width<= 1800){
                        price = 960.36;
                    }else if(width>=1801 && width<= 2000){
                        price = 996.40;
                    }else if(width>=2001 && width<= 2270){
                        price = 1089.68;
                    }else if(width>=2271 && width<= 2400){
                        price = 1102.40;
                    }else if(width>=2401 && width<= 2540){
                        price = 1167.06;
                    }
                }else if(height>=2051 && height<=2150){
                    if(width>=1175 && width<= 1260){
                        price = 895.70;
                    }else if(width>=1261 && width<= 1430){
                        price = 923.26;
                    }else if(width>=1431 && width<= 1530){
                        price = 938.10;
                    }else if(width>=1531 && width<= 1600){
                        price = 942.52;
                    }else if(width>=1601 && width<= 1630){
                        price = 952.94;
                    }else if(width>=1631 && width<= 1800){
                        price = 981.56;
                    }else if(width>=1801 && width<= 2000){
                        price = 1017.60;
                    }else if(width>=2001 && width<= 2270){
                        price = 1109.82;
                    }else if(width>=2271 && width<= 2400){
                        price = 1124.66;
                    }else if(width>=2401 && width<= 2540){
                        price = 1197.80;
                    }
                }else if(height>=2151 && height<=2300){
                    if(width>=1175 && width<= 1340){
                        price = 1038.80;
                    }else if(width>=1341 && width<= 1800){
                        price = 1096.04;
                    }else if(width>=1801 && width<= 2270){
                        price = 1197.80;
                    }else if(width>=2271 && width<= 2540){
                        price = 1368.46;
                    }
                }else if(height>=2301 && height<=2500){
                    if(width>=1175 && width<= 1340){
                        price = 1075.90;
                    }else if(width>=1341 && width<= 1800){
                        price = 1139.50;
                    }else if(width>=1801 && width<= 2270){
                        price = 1383.30;
                    }else if(width>=2271 && width<= 2540){
                        price = 1442.66;
                    }
                }else if(height>=2501 && height<=2630){
                    if(width>=1175 && width<= 1340){
                        price = 1102.40;
                    }else if(width>=1341 && width<= 1800){
                        price = 1167.06;
                    }else if(width>=1801 && width<= 2270){
                        price = 1411.92;
                    }else if(width>=2271 && width<= 2540){
                        price = 1442.66;
                    }
                }
                break;
            case "1ei120" :
                if (height == 2000) {
                if (width == 800) {
                    price = 427.18;
                } else if (width == 900) {
                    price = 440.96;
                } else if (width == 1000) {
                    price = 457.92;
                } else if (width == 1300) {
                    price = 561.80;
                } else if (width >=710 && width<=795) {
                    price = 436.72;
                } else if (width >=805 && width<=895) {
                    price = 451.56;
                } else if (width >=905 && width<=995) {
                    price = 467.46;
                }else if (width >= 710 && width <= 800) {
                    price = 478.06;
                } else if (width >= 801 && width <= 900) {
                    price = 492.90;
                } else if (width >= 901 && width <= 1000) {
                    price = 505.62;
                } else if (width >= 1001 && width <= 1100) {
                    price = 542.72;
                } else if (width >= 1101 && width <= 1200) {
                    price = 558.62;
                } else if (width >= 1201 && width <= 1340) {
                    price = 597.84;
                }
            } else if (height == 2050) {
                    if (width == 800) {
                        price = 427.18;
                    } else if (width == 900) {
                        price = 440.96;
                    } else if (width == 1000) {
                        price = 457.92;
                    } else if (width == 1100) {
                        price = 515.16;
                    } else if (width == 1200) {
                        price = 528.94;
                    } else if (width == 1300) {
                        price = 561.80;
                    } else if (width == 1340) {
                        price = 567.10;
                    }else if (width >=710 && width<=795) {
                        price = 436.72;
                    } else if (width >=805 && width<=895) {
                        price = 451.56;
                    } else if (width >=905 && width<=995) {
                        price = 467.46;
                    }else if (width >= 710 && width <= 800) {
                        price = 478.06;
                    } else if (width >= 801 && width <= 900) {
                        price = 492.90;
                    } else if (width >= 901 && width <= 1000) {
                        price = 505.62;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 542.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 558.62;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 597.84;
                    }

                }else if (height == 2100) {
                    if (width == 800) {
                        price = 457.92;
                    } else if (width == 900) {
                        price = 474.88;
                    } else if (width == 1000) {
                        price = 485.48;
                    } else if (width == 1100) {
                        price = 521.52;
                    } else if (width == 1200) {
                        price = 536.36;
                    } else if (width == 1300) {
                        price = 567.10;
                    } else if (width == 1340) {
                        price = 575.58;
                    }else if (width >= 710 && width <= 800) {
                        price = 484.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 500.32;
                    } else if (width >= 901 && width <= 1000) {
                        price = 515.16;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 551.20;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 564.98;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 604.20;
                    }

                }else if (height == 2150) {
                    if (width == 800) {
                        price = 434.60;
                    } else if (width == 900) {
                        price = 450.50;
                    } else if (width == 1000) {
                        price = 464.28;
                    } else if (width == 1100) {
                        price = 521.52;
                    } else if (width == 1200) {
                        price = 536.36;
                    } else if (width == 1300) {
                        price = 567.10;
                    } else if (width == 1340) {
                        price = 575.58;
                    }else if (width >=710 && width<=795) {
                        price = 440.96;
                    } else if (width >=805 && width<=895) {
                        price = 461.10;
                    } else if (width >=905 && width<=995) {
                        price = 472.76;
                    }else if (width >= 710 && width <= 800) {
                        price = 484.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 500.32;
                    } else if (width >= 901 && width <= 1000) {
                        price = 515.16;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 551.20;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 564.98;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 604.20;
                    }

                }else if (height == 2200) {
                    if (width == 800) {
                        price = 478.06;
                    } else if (width == 900) {
                        price = 495.02;
                    } else if (width == 1000) {
                        price = 508.80;
                    } else if (width == 1100) {
                        price = 569.22;
                    } else if (width == 1200) {
                        price = 590.42;
                    } else if (width == 1300) {
                        price = 623.28;
                    } else if (width == 1340) {
                        price = 630.70;
                    }else if (width >= 710 && width <= 900) {
                        price = 546.96;
                    } else if (width >= 901 && width <= 1125) {
                        price = 591.48;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 632.82;
                    }

                }else if (height >= 1900 && height <= 2050) {
                    if (width >= 710 && width <= 800) {
                        price = 478.06;
                    } else if (width >= 801 && width <= 900) {
                        price = 492.90;
                    } else if (width >= 901 && width <= 1000) {
                        price = 505.62;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 542.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 558.62;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 597.84;
                    }
                }else if (height >= 2051 && height <= 2150) {
                    if (width >= 710 && width <= 800) {
                        price = 484.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 500.32;
                    } else if (width >= 901 && width <= 1000) {
                        price = 515.16;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 551.20;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 564.98;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 604.20;
                    }
                }else if (height >= 2151 && height <= 2300) {
                    if (width >= 710 && width <= 900) {
                        price = 546.96;
                    } else if (width >= 901 && width <= 1125) {
                        price = 591.48;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 632.82;
                    }
                }else if (height >= 2301 && height <= 2500) {
                    if (width >= 710 && width <= 900) {
                        price = 567.10;
                    } else if (width >= 901 && width <= 1125) {
                        price = 612.68;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 728.22;
                    }
                }else if (height >= 2501 && height <= 2640) {
                    if (width >= 710 && width <= 900) {
                        price = 591.48;
                    } else if (width >= 901 && width <= 1125) {
                        price = 708.08;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 749.22;
                    }
                }
                break;
            case "1rei60" :
                if (height == 2000) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width >=546 && width<=795) {
                        price = 305.98;
                    } else if (width >=805 && width<=895) {
                        price = 318.95;
                    } else if (width >=905 && width<=995) {
                        price = 330.85;
                    } else if (width >= 641 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    }else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }

                }else if (height == 2050) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1100) {
                        price = 362.20;
                    } else if (width == 1200) {
                        price = 382.74;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width == 1340) {
                        price = 422.75;
                    }else if (width >=546 && width<=795) {
                        price = 305.98;
                    } else if (width >=805 && width<=895) {
                        price = 318.95;
                    } else if (width >=905 && width<=995) {
                        price = 330.85;
                    }else if (width >= 641 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    }else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                }else if (height == 2100) {
                    if (width == 800) {
                        price = 311.39 ;
                    } else if (width == 900) {
                        price = 323.28;
                    } else if (width == 1000) {
                        price = 337.33;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340) {
                        price = 438.97;
                    }else if (width >= 546 && width <= 640) {
                        price = 325.42;
                    } else if (width >= 641 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    }else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                }else if (height == 2150) {
                    if (width == 800) {
                        price = 294.09;
                    } else if (width == 900) {
                        price = 305.98;
                    } else if (width == 1000) {
                        price = 320.04;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340) {
                        price = 438.97;
                    }else if (width >=546 && width<=795) {
                        price = 315.71;
                    } else if (width >=805 && width<=895) {
                        price = 326.52;
                    } else if (width >=905 && width<=995) {
                        price = 339.50;
                    } else if (width >= 641 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    }else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                }else if (height == 2200) {
                    if (width == 800) {
                        price = 322.20;
                    } else if (width == 900) {
                        price = 338.42;
                    } else if (width == 1000) {
                        price = 354.63;
                    } else if (width == 1100) {
                        price = 414.10;
                    } else if (width == 1200) {
                        price = 437.89;
                    } else if (width == 1300) {
                        price = 470.32;
                    } else if (width == 1340) {
                        price = 476.81;
                    }else if (width >= 546 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }
                }else if (height >= 1775 && height <= 2050) {
                    if (width >= 546 && width <= 640) {
                        price = 320.12;
                    } else if (width >= 641 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    }else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                }else if (height >= 2051 && height <= 2150) {
                    if (width >= 546 && width <= 640) {
                        price = 325.42;
                    } else if (width >= 641 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    }else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                }else if (height >= 2151 && height <= 2300) {
                    if (width >= 546 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }
                }else if (height >= 2301 && height <= 2500) {
                    if (width >= 546 && width <= 900) {
                        price = 419.51;
                    } else if (width >= 901 && width <= 1125) {
                        price = 450.86;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 493.03;
                    }
                }else if (height >= 2501 && height <= 2670) {
                    if (width >= 546 && width <= 900) {
                        price = 435.72;
                    } else if (width >= 901 && width <= 1125) {
                        price = 493.03;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 549.25;
                    }
                }
                break;
            case "2rei60"  :
                if (height == 2000|| height==2050) {
                    if (width == 1150) {
                        price = 556.50;
                    } else if (width == 1200) {
                        price = 563.92;
                    } else if (width == 1250) {
                        price = 569.22;
                    } else if (width == 1300) {
                        price = 574.52;
                    } else if (width == 1350) {
                        price = 581.94;
                    } else if (width == 1400) {
                        price = 590.42;
                    } else if (width == 1450) {
                        price = 596.78;
                    } else if (width == 1600) {
                        price = 615.86;
                    } else if (width == 1700) {
                        price = 628.58;
                    } else if (width == 1800) {
                        price = 638.12;
                    } else if (width == 1900) {
                        price = 654.02;
                    } else if (width == 2000) {
                        price = 667.80;
                    }else if (width >= 890 && width <= 1280) {
                        price = 596.78;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 609.50;
                    } else if (width >= 1381&& width <= 1480) {
                        price = 625.40;
                    }else if (width >= 1481 && width <= 1600) {
                        price = 629.64;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 651.90;
                    } else if (width >= 1801&& width <= 2000) {
                        price = 678.40;
                    }else if(width>=2001 && width<= 2200){
                        price = 783.34;
                    }else if(width>=2201 && width<= 2400){
                        price = 803.48;
                    }else if(width>=2401 && width<= 2540){
                        price = 866.02;
                    }

                }else if (height == 2100) {
                if (width == 1150) {
                    price = 602.08;
                } else if (width == 1200) {
                    price = 609.50;
                } else if (width == 1250) {
                    price = 622.22;
                } else if (width == 1300) {
                    price = 629.64;
                } else if (width == 1350) {
                    price = 632.82;
                } else if (width == 1400) {
                    price = 641.30;
                } else if (width == 1450) {
                    price = 646.60;
                } else if (width == 1600) {
                    price = 668.86;
                } else if (width == 1700) {
                    price = 683.70;
                } else if (width == 1800) {
                    price = 696.42;
                } else if (width == 1900) {
                    price = 711.26;
                } else if (width == 2000) {
                    price = 725.04;
                }else if(width>=890 && width<= 1260){
                    price = 654.02;
                }else if(width>=1261 && width<= 1280){
                    price = 662.50;
                }else if(width>=1281 && width<= 1380){
                    price = 673.10;
                }else if(width>=1381 && width<= 1430){
                    price = 676.28;
                }else if(width>=1431 && width<= 1480){
                    price = 691.12;
                }else if(width>=1481 && width<= 1530){
                    price = 687.94;
                }else if(width>=1531 && width<= 1600){
                    price = 694.30;
                }else if(width>=1601 && width<= 1630){
                    price = 710.20;
                } else if(width>=1631 && width<= 1800){
                    price = 725.04;
                }else if(width>=1801 && width<= 2000){
                    price = 749.42;
                }else if(width>=2001 && width<= 2200){
                    price = 805.60;
                }else if(width>=2201 && width<= 2400){
                    price = 824.68;
                }else if(width>=2401 && width<= 2540){
                    price = 887.22;
                }

            }else if (height==2150) {
                    if (width == 1150) {
                        price = 573.46;
                    } else if (width == 1200) {
                        price = 581.94;
                    } else if (width == 1250) {
                        price = 591.48;
                    } else if (width == 1300) {
                        price = 597.84;
                    } else if (width == 1350) {
                        price = 602.08;
                    } else if (width == 1400) {
                        price = 607.38;
                    } else if (width == 1450) {
                        price = 612.68;
                    } else if (width == 1600) {
                        price = 633.88;
                    } else if (width == 1700) {
                        price = 649.78;
                    } else if (width == 1800) {
                        price = 665.68;
                    } else if (width == 1900) {
                        price = 675.22;
                    } else if (width == 2000) {
                        price = 689;
                    }else if (width >= 890 && width <= 1280) {
                        price = 610.56;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 627.52;
                    } else if (width >= 1381&& width <= 1480) {
                        price = 640.24;
                    }else if (width >= 1481 && width <= 1600) {
                        price = 651.90;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 676.28;
                    } else if (width >= 1801&& width <= 2000) {
                        price = 699.60;
                    }else if(width>=2001 && width<= 2200){
                        price = 805.60;
                    }else if(width>=2201 && width<= 2400){
                        price = 824.68;
                    }else if(width>=2401 && width<= 2540){
                        price = 887.22;
                    }

                }else if (height == 2200) {
                if (width == 1150) {
                    price = 630.70;
                } else if (width == 1200) {
                    price = 638.12;
                } else if (width == 1250) {
                    price = 649.78;
                } else if (width == 1300) {
                    price = 660.38;
                } else if (width == 1350) {
                    price = 665.68;
                } else if (width == 1400) {
                    price = 670.98;
                } else if (width == 1450) {
                    price = 674.16;
                } else if (width == 1600) {
                    price = 698.54;
                } else if (width == 1700) {
                    price = 716.56;
                } else if (width == 1800) {
                    price = 730.34;
                } else if (width == 1900) {
                    price = 743.08;
                } else if (width == 2000) {
                    price = 757.90;
                }else if(width>=890 && width<= 1100){
                    price = 693.24;
                }else if(width>=1101 && width<= 1340){
                    price = 728.22;
                }else if(width>=1341 && width<= 1800){
                    price = 789.70 ;
                }else if(width>=1801 && width<= 2250){
                    price = 867.08;
                }else if(width>=2251 && width<= 2540){
                    price = 942.34;
                }

            }else if(height>=1775 && height<=2050){
                    if(width>=890 && width<= 1260){
                        price = 641.30;
                    }else if(width>=1261 && width<= 1280){
                        price = 650.84;
                    }else if(width>=1281 && width<= 1380){
                        price = 662.50;
                    }else if(width>=1381 && width<= 1430){
                        price = 666.74;
                    }else if(width>=1431 && width<= 1480){
                        price = 680.52;
                    }else if(width>=1481 && width<= 1530){
                        price = 682.64;
                    }else if(width>=1531 && width<= 1600){
                        price = 682.84;
                    }else if(width>=1601 && width<= 1630){
                        price = 694.30;
                    } else if(width>=1631 && width<= 1800){
                        price = 701.72;
                    }else if(width>=1801 && width<= 2000){
                        price = 727.16;
                    }else if(width>=2001 && width<= 2200){
                        price = 783.34;
                    }else if(width>=2201 && width<= 2400){
                        price = 803.48;
                    }else if(width>=2401 && width<= 2540){
                        price = 866.02;
                    }
                }else if(height>=2051 && height<= 2150){
                    if(width>=890 && width<= 1260){
                        price = 654.02;
                    }else if(width>=1261 && width<= 1280){
                        price = 662.50;
                    }else if(width>=1281 && width<= 1380){
                        price = 673.10;
                    }else if(width>=1381 && width<= 1430){
                        price = 676.28;
                    }else if(width>=1431 && width<= 1480){
                        price = 691.12;
                    }else if(width>=1481 && width<= 1530){
                        price = 687.94;
                    }else if(width>=1531 && width<= 1600){
                        price = 694.30;
                    }else if(width>=1601 && width<= 1630){
                        price = 710.20;
                    } else if(width>=1631 && width<= 1800){
                        price = 725.04;
                    }else if(width>=1801 && width<= 2000){
                        price = 749.42;
                    }else if(width>=2001 && width<= 2200){
                        price = 805.60;
                    }else if(width>=2201 && width<= 2400){
                        price = 824.68;
                    }else if(width>=2401 && width<= 2540){
                        price = 887.22;
                    }
                }else if(height>=2151 && height<=2300){
                    if(width>=890 && width<= 1100){
                        price = 693.24;
                    }else if(width>=1101 && width<= 1340){
                        price = 728.22;
                    }else if(width>=1341 && width<= 1800){
                        price = 789.70 ;
                    }else if(width>=1801 && width<= 2250){
                        price = 867.08;
                    }else if(width>=2251 && width<= 2540){
                        price = 942.34;
                    }
                }else if(height>=2301 && height<=2500){
                    if(width>=890 && width<= 1100){
                        price = 709.14;
                    }else if(width>=1101 && width<= 1340){
                        price = 749.42;
                    }else if(width>=1341 && width<= 1800){
                        price = 817.26 ;
                    }else if(width>=1801 && width<= 2250){
                        price = 890.40;
                    }else if(width>=2251 && width<= 2540){
                        price = 972.02;
                    }
                }else if(height>=2501 && height<=2670){
                    if(width>=890 && width<= 1100){
                        price = 766.38;
                    }else if(width>=1101 && width<= 1340){
                        price = 811.96;
                    }else if(width>=1341 && width<= 1800){
                        price = 860.72 ;
                    }else if(width>=1801 && width<= 2250){
                        price = 974.14;
                    }else if(width>=2251 && width<= 2540){
                        price = 1076.96;
                    }
                }
                break;
            case "1rei120" :
                if (height == 2000) {
                    if (width == 800) {
                        price = 319.06;
                    } else if (width == 900) {
                        price = 339.20;
                    } else if (width == 1000) {
                        price = 351.92;
                    } else if (width == 1300) {
                        price = 478.06;
                    } else if (width >=546 && width<=795) {
                        price = 345.56;
                    } else if (width >=805 && width<=895) {
                        price = 361.46;
                    } else if (width >=905 && width<=995) {
                        price = 378.42;
                    }else if(width>=641 && width<= 800){
                        price = 378.42;
                    }else if(width>=801 && width<= 900){
                        price = 392.20;
                    }else if(width>=901 && width<= 1000){
                        price = 411.28;
                    }else if(width>=1001 && width<= 1100){
                        price = 451.56;
                    }else if(width>=1101 && width<= 1200){
                        price = 466.40;
                    }else if(width>=1201 && width<= 1340){
                        price = 515.16;
                    }

                }else if (height == 2050) {
                    if (width == 800) {
                        price = 319.06;
                    } else if (width == 900) {
                        price = 339.20;
                    } else if (width == 1000) {
                        price = 351.92;
                    } else if (width == 1100) {
                        price = 415.52;
                    } else if (width == 1200) {
                        price = 442.02;
                    } else if (width == 1300) {
                        price = 478.06;
                    } else if (width == 1340) {
                        price = 486.54;
                    }else if (width >=546 && width<=795) {
                        price = 345.56;
                    } else if (width >=805 && width<=895) {
                        price = 361.46;
                    } else if (width >=905 && width<=995) {
                        price = 378.42;
                    }else if(width>=641 && width<= 800){
                        price = 378.42;
                    }else if(width>=801 && width<= 900){
                        price = 392.20;
                    }else if(width>=901 && width<= 1000){
                        price = 411.28;
                    }else if(width>=1001 && width<= 1100){
                        price = 451.56;
                    }else if(width>=1101 && width<= 1200){
                        price = 466.40;
                    }else if(width>=1201 && width<= 1340){
                        price = 515.16;
                    }
                }else if (height == 2100) {
                    if (width == 800) {
                        price = 355.10;
                    } else if (width == 900) {
                        price = 369.94;
                    } else if (width == 1000) {
                        price = 387.96;
                    } else if (width == 1100) {
                        price = 434.60;
                    } else if (width == 1200) {
                        price = 460.04;
                    } else if (width == 1300) {
                        price = 498.20;
                    } else if (width == 1340) {
                        price = 509.86;
                    }else if(width>=546 && width<= 640){
                        price = 366.76;
                    }else if(width>=641 && width<= 800){
                        price = 385.84;
                    }else if(width>=801 && width<= 900){
                        price = 403.86;
                    }else if(width>=901 && width<= 1000){
                        price = 421.88;
                    }else if(width>=1001 && width<= 1100){
                        price = 466.40;
                    }else if(width>=1101 && width<= 1200){
                        price = 482.30;
                    }else if(width>=1201 && width<= 1340){
                        price = 522.58;
                    }
                }else if (height == 2150) {
                    if (width == 800) {
                        price = 336.02;
                    } else if (width == 900) {
                        price = 350.86;
                    } else if (width == 1000) {
                        price = 368.88;
                    } else if (width == 1100) {
                        price = 434.60;
                    } else if (width == 1200) {
                        price = 460.04;
                    } else if (width == 1300) {
                        price = 498.20;
                    } else if (width == 1340) {
                        price = 509.86;
                    }else if (width >=546 && width<=795) {
                        price = 355.10;
                    } else if (width >=805 && width<=895) {
                        price = 368.88;
                    } else if (width >=905 && width<=995) {
                        price = 385.84;
                    }else if(width>=641 && width<= 800){
                        price = 385.84;
                    }else if(width>=801 && width<= 900){
                        price = 403.86;
                    }else if(width>=901 && width<= 1000){
                        price = 421.88;
                    }else if(width>=1001 && width<= 1100){
                        price = 466.40;
                    }else if(width>=1101 && width<= 1200){
                        price = 482.30;
                    }else if(width>=1201 && width<= 1340){
                        price = 522.58;
                    }
                }else if (height == 2200) {
                    if (width == 800) {
                        price = 368.88;
                    } else if (width == 900) {
                        price = 387.96;
                    } else if (width == 1000) {
                        price = 407.04;
                    } else if (width == 1100) {
                        price = 478.06;
                    } else if (width == 1200) {
                        price = 504.56;
                    } else if (width == 1300) {
                        price = 548.02;
                    } else if (width == 1340) {
                        price = 558.62;
                    }else if(width>=546 && width<= 900){
                        price = 453.68;
                    }else if(width>=901 && width<= 1125){
                        price = 505.62;
                    }else if(width>=1126 && width<= 1340){
                        price = 560.74;
                    }
                }else if(height>=1775 && height<= 2050){
                    if(width>=546 && width<= 640){
                        price = 362.52;
                    }else if(width>=641 && width<= 800){
                        price = 378.42;
                    }else if(width>=801 && width<= 900){
                        price = 392.20;
                    }else if(width>=901 && width<= 1000){
                        price = 411.28;
                    }else if(width>=1001 && width<= 1100){
                        price = 451.56;
                    }else if(width>=1101 && width<= 1200){
                        price = 466.40;
                    }else if(width>=1201 && width<= 1340){
                        price = 515.16;
                    }
                }else if(height>=2051 && height<= 2150){
                    if(width>=546 && width<= 640){
                        price = 366.76;
                    }else if(width>=641 && width<= 800){
                        price = 385.84;
                    }else if(width>=801 && width<= 900){
                        price = 403.86;
                    }else if(width>=901 && width<= 1000){
                        price = 421.88;
                    }else if(width>=1001 && width<= 1100){
                        price = 466.40;
                    }else if(width>=1101 && width<= 1200){
                        price = 482.30;
                    }else if(width>=1201 && width<= 1340){
                        price = 522.58;
                    }
                }else if(height>=2151 && height<= 2300){
                    if(width>=546 && width<= 900){
                        price = 453.68;
                    }else if(width>=901 && width<= 1125){
                        price = 505.62;
                    }else if(width>=1126 && width<= 1340){
                        price = 560.74;
                    }
                }else if(height>=2301 && height<= 2500){
                    if(width>=546 && width<= 900){
                        price = 478.06;
                    }else if(width>=901 && width<= 1125){
                        price = 523.64;
                    }else if(width>=1126 && width<= 1340){
                        price = 645.54;
                    }
                }else if(height>=2501 && height<= 2670){
                    if(width>=546 && width<= 900){
                        price = 505.62;
                    }else if(width>=901 && width<= 1125){
                        price = 617.98;
                    }else if(width>=1126 && width<= 1340){
                        price = 674.16;
                    }
                }
                break;
            case "2rei120" :
                if (height == 2000|| height ==2050) {
                    if (width == 1150) {
                        price = 649.78;
                    } else if (width == 1200) {
                        price = 661.44;
                    } else if (width == 1250) {
                        price = 667.80;
                    } else if (width == 1300) {
                        price = 676.28;
                    } else if (width == 1350) {
                        price = 684.76;
                    } else if (width == 1400) {
                        price = 696.42;
                    } else if (width == 1450) {
                        price = 707.02;
                    } else if (width == 1600) {
                        price = 728.22;
                    } else if (width == 1700) {
                        price = 746.24;
                    } else if (width == 1800) {
                        price = 768.50;
                    } else if (width == 1900) {
                        price = 785.46;
                    } else if (width == 2000) {
                        price = 802.42;
                    }else if (width >= 890 && width <= 1280) {
                        price = 714.44;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 730.34;
                    } else if (width >= 1381&& width <= 1480) {
                        price = 747.30;
                    }else if (width >= 1481 && width <= 1600) {
                        price = 751.54;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 783.34;
                    } else if (width >= 1801&& width <= 2000) {
                        price = 814.08;
                    }else if(width>=2001 && width<= 2200){
                        price = 952.94;
                    }else if(width>=2201 && width<= 2400){
                        price = 988.98;
                    }else if(width>=2401 && width<= 2540){
                        price = 1044.10;
                    }
                }else if (height == 2100) {
                    if (width == 1150) {
                        price = 708.08;
                    } else if (width == 1200) {
                        price = 716.56;
                    } else if (width == 1250) {
                        price = 729.28;
                    } else if (width == 1300) {
                        price = 738.82;
                    } else if (width == 1350) {
                        price = 745.18;
                    } else if (width == 1400) {
                        price = 755.78;
                    } else if (width == 1450) {
                        price = 762.14;
                    } else if (width == 1600) {
                        price = 797.12;
                    } else if (width == 1700) {
                        price = 819.38;
                    } else if (width == 1800) {
                        price = 832.10;
                    } else if (width == 1900) {
                        price = 856.48;
                    } else if (width == 2000) {
                        price = 873.44;
                    }else if(width>=890 && width<= 1260){
                        price = 772.74;
                    }else if(width>=1261 && width<= 1280){
                        price = 782.28;
                    }else if(width>=1281 && width<= 1380){
                        price = 797.12;
                    }else if(width>=1381 && width<= 1430){
                        price = 802.42;
                    }else if(width>=1431 && width<= 1480){
                        price = 819.38;
                    }else if(width>=1481 && width<= 1530){
                        price = 825.74;
                    }else if(width>=1531 && width<= 1600){
                        price = 836.34;
                    }else if(width>=1601 && width<= 1630){
                        price = 842.70;
                    } else if(width>=1631 && width<= 1800){
                        price = 873.44;
                    }else if(width>=1801 && width<= 2000){
                        price = 912.66;
                    }else if(width>=2001 && width<= 2200){
                        price = 987.92;
                    }else if(width>=2201 && width<= 2400){
                        price = 1013.36;
                    }else if(width>=2401 && width<= 2540){
                        price = 1086.50;
                    }

                }else if (height == 2150) {
                    if (width == 1150) {
                        price = 673.10;
                    } else if (width == 1200) {
                        price = 682.64;
                    } else if (width == 1250) {
                        price = 693.24;
                    } else if (width == 1300) {
                        price = 704.90;
                    } else if (width == 1350) {
                        price = 713.38;
                    } else if (width == 1400) {
                        price = 719.74;
                    } else if (width == 1450) {
                        price = 727.16;
                    } else if (width == 1600) {
                        price = 758.96;
                    } else if (width == 1700) {
                        price = 780.16;
                    } else if (width == 1800) {
                        price = 795.00;
                    } else if (width == 1900) {
                        price = 813.02;
                    } else if (width == 2000) {
                        price = 832.10;
                    }else if (width >= 890 && width <= 1280) {
                        price = 738.82;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 754.72;
                    } else if (width >= 1381&& width <= 1480) {
                        price = 769.56;
                    }else if (width >= 1481 && width <= 1600) {
                        price = 773.80;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 808.78;
                    } else if (width >= 1801&& width <= 2000) {
                        price = 848.00;
                    }else if(width>=2001 && width<= 2200){
                        price = 987.92;
                    }else if(width>=2201 && width<= 2400){
                        price = 1013.36;
                    }else if(width>=2401 && width<= 2540){
                        price = 1086.50;
                    }

                }else if (height == 2200) {
                    if (width == 1150) {
                        price = 740.94;
                    } else if (width == 1200) {
                        price = 749.42;
                    } else if (width == 1250) {
                        price = 762.14;
                    } else if (width == 1300) {
                        price = 773.80;
                    } else if (width == 1350) {
                        price = 783.34;
                    } else if (width == 1400) {
                        price = 789.70;
                    } else if (width == 1450) {
                        price = 799.24;
                    } else if (width == 1600) {
                        price = 832.10;
                    } else if (width == 1700) {
                        price = 856.48;
                    } else if (width == 1800) {
                        price = 871.32;
                    } else if (width == 1900) {
                        price = 896.76;
                    } else if (width == 2000) {
                        price = 916.90;
                    }else if(width>=890 && width<= 1100){
                        price = 809.84;
                    }else if(width>=1101 && width<= 1340){
                        price = 862.84;
                    }else if(width>=1341 && width<= 1800){
                        price = 952.94 ;
                    }else if(width>=1801 && width<= 2250){
                        price = 1054.70;
                    }else if(width>=2251 && width<= 2540){
                        price = 1242.32;
                    }

                }else if(height>=1775 && height<= 2050){
                    if(width>=890 && width<= 1260){
                        price = 744.12;
                    }else if(width>=1261 && width<= 1280){
                        price = 764.26;
                    }else if(width>=1281 && width<= 1380){
                        price = 780.16;
                    }else if(width>=1381 && width<= 1430){
                        price = 784.30;
                    }else if(width>=1431 && width<= 1480){
                        price = 802.42;
                    }else if(width>=1481 && width<= 1530){
                        price = 804.54;
                    }else if(width>=1531 && width<= 1600){
                        price = 804.54;
                    }else if(width>=1601 && width<= 1630){
                        price = 819.38;
                    } else if(width>=1631 && width<= 1800){
                        price = 846.94;
                    }else if(width>=1801 && width<= 2000){
                        price = 879.80;
                    }else if(width>=2001 && width<= 2200){
                        price = 952.94;
                    }else if(width>=2201 && width<= 2400){
                        price = 988.98;
                    }else if(width>=2401 && width<= 2540){
                        price = 1044.10;
                    }
                }else if(height>=2051 && height<= 2150){
                    if(width>=890 && width<= 1260){
                        price = 772.74;
                    }else if(width>=1261 && width<= 1280){
                        price = 782.28;
                    }else if(width>=1281 && width<= 1380){
                        price = 797.12;
                    }else if(width>=1381 && width<= 1430){
                        price = 802.42;
                    }else if(width>=1431 && width<= 1480){
                        price = 819.38;
                    }else if(width>=1481 && width<= 1530){
                        price = 825.74;
                    }else if(width>=1531 && width<= 1600){
                        price = 836.34;
                    }else if(width>=1601 && width<= 1630){
                        price = 842.70;
                    } else if(width>=1631 && width<= 1800){
                        price = 873.44;
                    }else if(width>=1801 && width<= 2000){
                        price = 912.66;
                    }else if(width>=2001 && width<= 2200){
                        price = 987.92;
                    }else if(width>=2201 && width<= 2400){
                        price = 1013.36;
                    }else if(width>=2401 && width<= 2540){
                        price = 1086.50;
                    }
                }else if(height>=2151 && height<=2300){
                    if(width>=890 && width<= 1100){
                        price = 809.84;
                    }else if(width>=1101 && width<= 1340){
                        price = 862.84;
                    }else if(width>=1341 && width<= 1800){
                        price = 952.94 ;
                    }else if(width>=1801 && width<= 2250){
                        price = 1054.70;
                    }else if(width>=2251 && width<= 2540){
                        price = 1242.32;
                    }
                }else if(height>=2301 && height<=2500){
                    if(width>=890 && width<= 1100){
                        price = 832.10;
                    }else if(width>=1101 && width<= 1340){
                        price = 886.16;
                    }else if(width>=1341 && width<= 1800){
                        price = 981.56 ;
                    }else if(width>=1801 && width<= 2250){
                        price = 1227.48;
                    }else if(width>=2251 && width<= 2540){
                        price = 1264.58;
                    }
                }else if(height>=2501 && height<=2670){
                    if(width>=890 && width<= 1100){
                        price = 907.36;
                    }else if(width>=1101 && width<= 1340){
                        price = 967.36;
                    }else if(width>=1341 && width<= 1800){
                        price = 1048.34 ;
                    }else if(width>=1801 && width<= 2250){
                        price = 1279.42;
                    }else if(width>=2251 && width<= 2540){
                        price = 1367.40;
                    }
                }
                break;

        }
        return price * 1.025;
    }
    }