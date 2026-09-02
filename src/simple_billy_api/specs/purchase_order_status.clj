(ns simple-billy-api.specs.purchase-order-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def purchase-order-status-data
  {
   })

(def purchase-order-status-spec
  (ds/spec
    {:name ::purchase-order-status
     :spec purchase-order-status-data}))
