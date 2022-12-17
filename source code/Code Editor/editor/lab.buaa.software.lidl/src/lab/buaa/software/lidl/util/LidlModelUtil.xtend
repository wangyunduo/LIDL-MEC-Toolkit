package lab.buaa.software.lidl.util

import lab.buaa.software.lidl.lidl.LidlData
import lab.buaa.software.lidl.lidl.CompositeDataType
import lab.buaa.software.lidl.lidl.RefDataType

class LidlModelUtil {
	def static datatypeAsString(LidlData d) {
		switch (d.definition) {
			CompositeDataType: '''CompositeDataType'''
//				'''«d.definition.items.get(0).type.name», «d.definition.items.length>1?d.definition.items.get(1).type.name:""» ...'''
			RefDataType: '''RefDataType'''
//				'''«d.definition.items.get(0).type.name»'''
		}
	}
}
