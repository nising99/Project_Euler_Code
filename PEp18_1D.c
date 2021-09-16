#include <stdio.h>

int main()
{
    int result=75, compare=0;
    int b[2]={95,64};
    int c[3]={17,47,82};
    int d[4]={18,35,87,10};
    int e[5]={20,4,82,47,65};
    int f[6]={19,1,23,75,3,34};
    int g[7]={88,2,77,73,7,63,67};
    int h[8]={99,65,4,28,6,16,70,92};
    int i[9]={41,41,26,56,83,40,80,70,33};
    int j[10]={41,48,72,33,47,32,37,16,94,29};
    int k[11]={53,71,44,65,25,43,91,52,97,51,14};
    int l[12]={70,11,33,28,77,73,17,78,39,68,17,57};
    int m[13]={91,71,52,38,17,14,91,43,58,50,27,29,48};
    int n[14]={63,66,04,68,89,53,67,30,73,16,69,87,40,31};
    int o[15]={4,62,98,27,23,9,70,98,73,93,38,53,60,4,23};
    
    for(int bq=0;bq<2;bq++){
        for(int cq=bq;cq<bq+2;cq++){
            for(int dq=cq;dq<cq+2;dq++){
                for(int eq=dq;eq<dq+2;eq++){
                    for(int fq=eq;fq<eq+2;fq++){
                        for(int gq=fq;gq<fq+2;gq++){
                            for(int hq=gq;hq<gq+2;hq++){
                                for(int iq=hq;iq<hq+2;iq++){
                                    for(int jq=iq;jq<iq+2;jq++){
                                        for(int kq=jq;kq<jq+2;kq++){
                                            for(int lq=kq;lq<kq+2;lq++){
                                                for(int mq=lq;mq<lq+2;mq++){
                                                    for(int nq=mq;nq<mq+2;nq++){
                                                        for(int oq=nq;oq<nq+2;oq++){
                                                            result=result+b[bq]+c[cq]+d[dq]+e[eq]+f[fq]+g[gq]+h[hq]+i[iq]+j[jq]+k[kq]+l[lq]+m[mq]+n[nq]+o[oq];
                                                            if(result>compare){
                                                                compare=result;
                                                            }
                                                            result=75;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
            }
            
        }
    }
    printf("%d", compare);

    return 0;
}
