package com.cherry.cloud.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class TokenFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return ZuulFilterType.PRE.value();//pre / route / post / error
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        /*RequestContext requestContext = RequestContext.getCurrentContext();
        String token = requestContext.getRequest().getParameter("token");
        return !StringUtils.isEmpty(token);*/
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        String token = context.getRequest().getParameter("token");
        if (StringUtils.isEmpty(token)) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            context.setResponseBody(HttpStatus.UNAUTHORIZED.name());
            if (log.isInfoEnabled()) {
                log.info("\"{}\" unauthorized", context.getRequest().getRequestURI());
            }
        }
        return null;
    }
}
