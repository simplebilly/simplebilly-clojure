(ns simple-billy-api.specs.production-order-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def production-order-status-data
  {
   })

(def production-order-status-spec
  (ds/spec
    {:name ::production-order-status
     :spec production-order-status-data}))
