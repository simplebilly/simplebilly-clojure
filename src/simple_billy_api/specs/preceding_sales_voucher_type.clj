(ns simple-billy-api.specs.preceding-sales-voucher-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def preceding-sales-voucher-type-data
  {
   })

(def preceding-sales-voucher-type-spec
  (ds/spec
    {:name ::preceding-sales-voucher-type
     :spec preceding-sales-voucher-type-data}))
