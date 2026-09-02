(ns simple-billy-api.specs.production-order-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def production-order-status-update-data
  {
   (ds/req :status) string?
   })

(def production-order-status-update-spec
  (ds/spec
    {:name ::production-order-status-update
     :spec production-order-status-update-data}))
