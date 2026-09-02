(ns simple-billy-api.specs.price-tier-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def price-tier-create-data
  {
   (ds/opt :customerGroupId) string?
   (ds/opt :minQuantity) int?
   (ds/req :productId) uuid?
   (ds/req :unitPrice) string?
   })

(def price-tier-create-spec
  (ds/spec
    {:name ::price-tier-create
     :spec price-tier-create-data}))
