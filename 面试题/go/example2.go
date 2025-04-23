package main

import "sync"

// 单例模式
type Singleton struct{}

var instance *Singleton

var once sync.Once // 确保全局唯一实例

func GetInstance() *Singleton {
	once.Do(func() { instance = &Singleton{} })
	return instance
}

// 工厂模式
