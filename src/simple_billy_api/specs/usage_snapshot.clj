(ns simple-billy-api.specs.usage-snapshot
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-snapshot-data
  {
   (ds/req :connectors) int?
   (ds/req :invoicesThisMonth) int?
   (ds/req :overageSeats) int?
   (ds/req :users) int?
   })

(def usage-snapshot-spec
  (ds/spec
    {:name ::usage-snapshot
     :spec usage-snapshot-data}))
