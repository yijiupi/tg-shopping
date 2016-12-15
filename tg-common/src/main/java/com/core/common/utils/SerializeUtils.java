/**
 * SerializeUtils.java
 */
package com.core.common.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.core.exception.BusinessException;

/**
 * 序列化对象
 * @author Administrator
 *
 */
public final class SerializeUtils {
    private static Logger logger = LoggerFactory.getLogger(SerializeUtils.class);
    
    /**
     * 隐藏构造
     */
    private SerializeUtils(){
        
    }

    /**
     * 序列化
     * @param object
     * @return
     * @throws BusinessException
     */
    public static byte[] serialize(Object object) throws BusinessException {
        if(object == null) 
        {
            return new byte[0];
        }
        ObjectOutputStream oos;
        ByteArrayOutputStream baos;
        try {
            // 序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);

            return baos.toByteArray();
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw BusinessException.SERIALIZE_ERROR.newInstance(ex, "序列化对象失败");
        }
    }

    /**
     * 反序列化
     * @param bytes
     * @return
     * @throws BusinessException
     */
    public static Object unSerialize(byte[] bytes) throws BusinessException {
        if(bytes == null) 
        {
            return null;
        }
        ByteArrayInputStream bais = null;
        try {
            // 反序列化
            bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw BusinessException.SERIALIZE_ERROR.newInstance(ex, "反序列化对象失败");
        }
    }
}
