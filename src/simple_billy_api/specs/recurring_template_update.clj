(ns simple-billy-api.specs.recurring-template-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.execution-status :refer :all]
            [simple-billy-api.specs.recurring-template-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def recurring-template-update-data
  {
   (ds/opt :endDate) inst?
   (ds/opt :executionInterval) string?
   (ds/opt :executionStatus) execution-status-spec
   (ds/opt :finalize) boolean?
   (ds/opt :lastExecutedAt) inst?
   (ds/opt :name) string?
   (ds/opt :nextExecutionAt) inst?
   (ds/opt :startDate) inst?
   (ds/opt :templateType) recurring-template-type-spec
   (ds/opt :voucherData) any-type-spec
   })

(def recurring-template-update-spec
  (ds/spec
    {:name ::recurring-template-update
     :spec recurring-template-update-data}))
