(ns simple-billy-api.specs.product-stock
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-stock-data
  {
   (ds/req :name) string?
   (ds/req :product_id) uuid?
   (ds/req :sku) string?
   (ds/opt :stock_quantity) int?
   })

(def product-stock-spec
  (ds/spec
    {:name ::product-stock
     :spec product-stock-data}))
