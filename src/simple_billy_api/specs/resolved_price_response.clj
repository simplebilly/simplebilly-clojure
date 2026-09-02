(ns simple-billy-api.specs.resolved-price-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def resolved-price-response-data
  {
   (ds/req :isListPrice) boolean?
   (ds/opt :priceTierId) string?
   (ds/req :productId) uuid?
   (ds/req :quantity) int?
   (ds/req :unitPrice) string?
   })

(def resolved-price-response-spec
  (ds/spec
    {:name ::resolved-price-response
     :spec resolved-price-response-data}))
