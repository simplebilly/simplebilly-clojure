(ns simple-billy-api.specs.voucher-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def voucher-type-data
  {
   })

(def voucher-type-spec
  (ds/spec
    {:name ::voucher-type
     :spec voucher-type-data}))
