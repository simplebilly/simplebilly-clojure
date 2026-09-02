(ns simple-billy-api.specs.cart-item-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cart-item-input-data
  {
   (ds/req :product_id) uuid?
   (ds/req :quantity) int?
   })

(def cart-item-input-spec
  (ds/spec
    {:name ::cart-item-input
     :spec cart-item-input-data}))
