package me.chanjar.weixin.channel.api.impl;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 视频号小店服务实现
 *
 * @author <a href="https://github.com/lixize">Zeyes</a>
 */
@Slf4j
public class WxChannelServiceImpl extends WxChannelServiceHttpClientImpl {

  public WxChannelServiceImpl() {
  }

  /**
   * 设置获取access_token接口参数.
   *
   * @param stabled      false 表示调用AccessToken接口， true调用稳定版接口
   * @param forceRefresh stabled=true使用， true表示强制刷新模式
   */
  public WxChannelServiceImpl(Boolean stabled, Boolean forceRefresh) {
    super(stabled, forceRefresh);
  }
}
