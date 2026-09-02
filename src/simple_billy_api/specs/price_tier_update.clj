(ns simple-billy-api.specs.price-tier-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def price-tier-update-data
  {
   (ds/opt :customerGroupId) string?
   (ds/opt :minQuantity) int?
   (ds/opt :productId) uuid?
   (ds/req :unitPrice) string?
   })

(def price-tier-update-spec
  (ds/spec
    {:name ::price-tier-update
     :spec price-tier-update-data}))
