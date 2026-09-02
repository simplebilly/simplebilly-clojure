(ns simple-billy-api.specs.automation-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def automation-dto-data
  {
   (ds/req :automationKey) string?
   (ds/req :config) any-type-spec
   (ds/opt :defaultDay) int?
   (ds/req :description) string?
   (ds/req :enabled) boolean?
   (ds/req :kind) string?
   (ds/opt :lastRunAt) inst?
   (ds/opt :nextRunAt) inst?
   (ds/req :scheduleKind) string?
   })

(def automation-dto-spec
  (ds/spec
    {:name ::automation-dto
     :spec automation-dto-data}))
