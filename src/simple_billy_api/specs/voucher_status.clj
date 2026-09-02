(ns simple-billy-api.specs.voucher-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def voucher-status-data
  {
   })

(def voucher-status-spec
  (ds/spec
    {:name ::voucher-status
     :spec voucher-status-data}))
